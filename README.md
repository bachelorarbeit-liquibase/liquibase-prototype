# Liquibase Spring-Boot Prototype

This project contains a prototype for a Liquibase integration into a Spring-Boot application.

## Requirements

- Maven > 3.8
- JDK > 17
- Docker (for local testing)

## Build the project

```shell
mvn package
```

## Run the project

Start the database declared in the `docker-compose.yml` file:

```shell
docker compose up
```

Start the application with default settings:

```shell
java -jar target/liquibase-prototype-0.0.1-SNAPSHOT.jar
```

### Alternative setting presets

Additional Spring-Boot Profiles are available to start the application with different settings.

#### With all extensions

Start the application with all available extensions:

```shell
java -jar target/liquibase-prototype-0.0.1-SNAPSHOT.jar -Dspring.profiles.active=all-extensions
```

#### With demo-data for the base product

Start the application with demo-data:

```shell
java -jar target/liquibase-prototype-0.0.1-SNAPSHOT.jar -Dspring.profiles.active=demo-data
```

#### With all extensions and demo-data

Start the application with all available extensions and corresponding demo-data:

```shell
java -jar target/liquibase-prototype-0.0.1-SNAPSHOT.jar -Dspring.profiles.active=all-extensions-demo-data
```


## Project structure

```
src/
└── main
    ├── java
    │     └── myerpapp
    │         ├── base
    │         │     ├── customer
    │         │     │     └── CustomerEntity.java
    │         │     ├── machine
    │         │     │     └── MachineEntity.java
    │         │     └── order
    │         │         └── OrderEntity.java
    │         ├── inventory
    │         │     ├── InventoryItemEntity.java
    │         │     └── WarehouseEntity.java
    │         └── LiquibasePrototypeApplication.java
    └── resources
        ├── application.yml
        └── db
            └── changelog
                ├── master.xml
                ├── master-demo-data.xml
                ├── master-migrations.xml
                ├── migrations
                │   ├── 2024-12-14_15-00_create_customer_table.xml
                │   ├── 2024-12-14_15-10_create_machines_table.xml
                │   ├── 2024-12-14_15-20_create_order_table.xml
                │   ├── 2024-12-15_10-00_create_warehouse_table.xml
                │   └── 2024-12-15_10-20_create_inventory_item_table.xml
                └── demo-data
                      ├── 2024-12-14_15-00_customer_demo_data.xml
                      ├── 2024-12-15_11-00_warehouse_demo_data.xml
                      └── sql
                          ├── customers.sql
                          └── warehouses.sql
```
