FROM postgres
ENV POSTGRES_DB sd
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD postgres
COPY create.sql /docker-entrypoint-initdb.d/
