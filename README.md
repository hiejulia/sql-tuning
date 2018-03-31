# sql-tuning




### Stack 
+ PostgreSQL
+ Spring Boot 



### SQL tuning with Postgresql 
+ Database index:
    + Measure query and index block statistics 
    + Index lookup 
    + Compare index scans and sequential scans
    + Clustering against index
    + Concurrent index 
    + Combined index 
    + Partial index 
    + Finding unused index 
    + Forcing a query to use index 
    + Detecting missing index 
    
+ Query optimization 
    + Timing overhead 
    + Hot and code cache
    + Clear the cache 
    + Query plan node structure 
    + Generate `explain` plan 
    + Computing basic cost 
    + Run sequential scans
    + Run bitmap heap and index scan 
    + Aggregate and hash aggregate 
    + Grouping
    + Work with set operation
    + Run a CTE scan 
    + Nesting loops 
    + Working with merge and hash join 
    + Working on semi and anti joins 

+ Database monitoring and performance
    + Check active session  
    + Find blocked session 
    + Deal with deadlocks 
    + Table access statistics
    + Routine reindexing 
    + Log slow statements
    + Disk usage
    + Page corruption
    + Planner statistics
    + Tuning with background writer statistics
    + Postgresql : catalog views, views, extensions to monitor 

+ 3rd party replication management utilities 
    + Set up Barman 
    + Back up and recovery using Barman 
    + Set up omniPITR
    + WAL management 
    + Set up Repmgr to create Replica 
    + Set up Walctl to create replica 
    
+ High availability and replication 
    + Set up hot streaming replication / master-slave streaming replication 
    + Replication using some other tools 

+ Connection pooling and database partitioning
    + install pgpool 
    
    
