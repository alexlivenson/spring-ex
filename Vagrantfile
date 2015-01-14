# -*- mode: ruby -*-
# vi: set ft=ruby :

# Vagrantfile API/syntax version. Don't touch unless you know what you're doing!
VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  # Ensure the appropriate plugins are installed before starting
  if Vagrant.has_plugin? 'vagrant-cachier' and Vagrant.has_plugin? 'vagrant-omnibus'
    config.cache.scope = :box 
    config.cache.enable :generic, {
      'maven' => { cache_dir: '/root/.m2/repository' }
    }
    config.omnibus.chef_version = "11.16.0" 
  else
    abort "Please run the following command to install the required vagrant plugins:\n" +
      "`vagrant plugin install vagrant-cachier ; vagrant plugin install vagrant-omnibus`"
  end
  
  # Set the base box
  config.vm.box = 'chef/centos-6.5'

  # MySQL
  mysql_port = '3306'
  mysql_allow_remote_root = true
  mysql_root_network_acl = ['0.0.0.0/0']
  mysql_root_password = 'ilikerandompasswords'
  acl_subnet = '0.0.0.0/0'

  # Create a forwarded port mapping which allows access to a specific port
  # within the machine from a port on the host machine. In the example below,
  # accessing "localhost:8080" will access port 80 on the guest machine.
  config.vm.network :forwarded_port, guest: 8080, host: 8080
  config.vm.network :forwarded_port, guest: mysql_port, host: mysql_port

  # If true, then any SSH connections made will enable agent forwarding.
  # Default value: false
  # config.ssh.forward_agent = true

  # Share an additional folder to the guest VM. The first argument is
  # the path on the host to the actual folder. The second argument is
  # the path on the guest to mount the folder. And the optional third
  # argument is a set of non-required options.
  # config.vm.synced_folder "../data", "/vagrant_data"

  # Provider-specific configuration so you can fine-tune various
  # backing providers for Vagrant. These expose provider-specific options.
  # Example for VirtualBox:
  #
  config.vm.provider :virtualbox do |vb, override|
    vb.memory = 1024
  end  #

  config.vm.provision "chef_solo" do |chef|
    chef.cookbooks_path = "devops/chef/cookbooks"
    chef.roles_path = "devops/chef/roles"
    chef.data_bags_path = "devops/chef/data_bags"
    chef.add_recipe "mysql::server"
    # chef.add_role "web"
  
    # You may also specify custom JSON attributes:
    chef.json = {
      'mysql' => {
        'port' => mysql_port,
        'allow_remote_root' => mysql_allow_remote_root,
        'root_network_acl' => mysql_root_network_acl,
        'server_root_password' => mysql_root_password
      }
    }
  end
end
