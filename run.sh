sudo docker build -t banco/postgres .
sudo docker run -p 5432:5432  --name postgres -d banco/postgres
