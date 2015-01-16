default['myApp-database']['schema'] = "test_db"
default['myApp-database']['username'] = "testuser"
default['myApp-database']['password'] = "testpassword"
default['myApp-database']['acl_subnet'] = "0.0.0.0/32"
default['myApp-database']['packer_deployment'] = false
default['myApp-database']['source_path'] = "/tmp/source"
default['myApp-database']['db_resource_path'] = "#{node['myApp-database']['source_path']}/src/main/resources"

