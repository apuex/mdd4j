# Notes

## RDBMS Database connection limits.

Each database instance has a limited number connections allowed. 
If a multi-node cluster deployment is created by simply deploy a simple all-in-one package to each node in the clusters,
this maybe a problem when the number of nodes grows large. 

Because each node creates a connection pool of its own, and
each pool requires a minimum number of connections. 
When times the number of nodes, the total number of connections may be very large.
The excerssive number connections offers no help to database performance, just lags it behind.

So, when depolying a large cluster, just limit persistence service to a limited number of nodes.



