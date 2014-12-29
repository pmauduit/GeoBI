Introduction
============

This is a fork of Camptocamp's GeoBI webapp, which aims to solve some issues
with the provided build system (based on Gradle).

I put some fixes with the default maven repositories, and added a geofoodmart
profile, in order to easily test or deploy the webapp using the well-known
geofoodmart sample.

Installation
=============

If you want to try the app using geofoodmart datas:

$ wget http://trac.spatialytics.com/geomondrian/export/6/trunk/demo/geofoodmart_sql_postgres.zip

$ unzip geofoodmart_sql_postgres.zip

$ createdb geodw

$ createlang plpgsql geodw

$ psql -f /usr/share/postgresql/<path/to>/postgis/postgis.sql geodw

$ psql -f /<same path as previously>/spatial_ref_sys.sql geodw

$ psql geodw < geofoodmart.sql

$ wget -O webapp/src/main/webapp/WEB-INF/classes/geofoodmart.xml http://trac.spatialytics.com/geomondrian/export/6/trunk/demo/GeoFoodMart.xml

$ ./gradlew jettyRun -Pserver=geofoodmart

That should do the trick.

Have fun,

- Pierre



