Spring MVC Errors:

1. Missing artifact javax.servlet.jsp.jstl:jstl:jar:1.2

2. error: 'dependencies.dependency.version' for javax.servlet:jsp-api:jar is missing.
3. o.s.w.s.r.ResourceHttpRequestHandler : Path with "WEB-INF" or "META-INF":

for the above errors while attempting to render JSP file, maven dependency should be added. As of 08/07/2020 it is working

see below link for reference,
https://www.andygibson.net/blog/quickbyte/jstl-missing-from-maven-repositories/


If spring actuator endpints are not working we need to add like below /actuator/metrics in recent update as of 08/07/2020 it is working
http://localhost:8090/actuator/metrics
