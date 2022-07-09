# Academia-Guidance
Academia Guidance project for therap
# java installation
Install java 17 (for ubuntu- https://www.youtube.com/watch?v=ogWKP9Lm-Qo)


# Using Mysql from command line
### install mysql in ubuntu
```
  sudo apt update
  sudo apt install mysql-server
  sudo systemctl start mysql.service     // start server
  systemctl status mysql.service         // status of server
```
Upon installation in this way, MySQL creates a user account named `root`. his user has full privileges over the MySQL server. it’s best to avoid using this account outside of administrative functions. Create other user account to do normal DB operations. To acess the root user type `sudo mysql`(if you have installed in this way) in command line. this root don't require any password. After login to `root` create other user for use.
</br>

`CREATE USER 'username'@'host' IDENTIFIED WITH authentication_plugin BY 'password';` to create new user here username=new DB user name, host=db host, if you plan to use db locally then set host=localhost, password=give a password. and then give permission to the user, `GRANT PRIVILEGE ON database.table TO 'username'@'host';`

### configure mysql 
```
  sudo mysql  // in password give your ubuntu password

  CREATE USER 'therap'@'localhost' IDENTIFIED BY '1234';

  GRANT CREATE, ALTER, DROP, INSERT, UPDATE, DELETE, SELECT, REFERENCES, RELOAD on *.* TO 'therap'@'localhost' WITH GRANT OPTION;

  FLUSH PRIVILEGES;

  exit;
```
login as new user
```
  mysql -u therap -p      // give the user password 
```


### uninstall mysql from ubutu
```
  sudo apt purge mysql-server*
  sudo rm -r /etc/mysql /var/lib/mysql
  sudo rm -r /var/log/mysql
  sudo apt autoremove
```

# project initialization
- go to the [link](https://start.spring.io/)
### now select
```
  Type -> merven
  Java version -> (2.7.1)
  Select spring boot version -> keep as it is
  Packaging -> jar
```
### Add dependency
```
    Spring web
    Mysqp driver
    Spring data jpa( internally use hibernate, to talk with database)
    Spring boot starter security ( for auto security management)
    Thymleaf (for  htm, front endl)
```
Finally download the generated project from website and unzip it.
### In application.properties file add database information


