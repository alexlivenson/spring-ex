    #
# Cookbook Name:: myApp-database
# Recipe:: default
#
# Copyright 2015, YOUR_COMPANY_NAME
#
# All rights reserved - Do Not Redistribute
#
include_recipe 'mysql::server'

execute "create-database" do
    cwd "#{node['myApp-database']['db_resource_path']}"
    command "mysql -u root -p#{node['mysql']['server_root_password']} < create-db.sql"
end

execute "flyway-migrations" do
    cwd "/vagrant/app"
    command "sh gradlew flywayInit; sh gradlew flywayMigrate"
end

execute "mysql -u root -p#{node['mysql']['server_root_password']} -e \"GRANT ALL ON #{node['myApp-database']['schema']}.* TO '#{node['myApp-database']['username']}'@'%' IDENTIFIED BY '#{node['myApp-database']['password']}' WITH GRANT OPTION\""
execute "mysql -u root -p#{node['mysql']['server_root_password']} -e \"GRANT ALL PRIVILEGES ON #{node['myApp-database']['schema']}.* TO '#{node['myApp-database']['username']}'@'#{node['myApp-database']['acl_subnet']}' IDENTIFIED BY '#{node['myApp-database']['password']}' WITH GRANT OPTION\""
