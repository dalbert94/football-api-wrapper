<h1>Football API wrapper</h1>
<h2>This repo is used to make calls to the Hackerrank football API</h2>

<h2>How to Demo:</h2>

<h3>**The easy way - If you already have docker installed:**</h3>

Build and package Docker container. You may need help from sudo. <br />

`docker build -t football-demo .`<br />

Run app in Docker container: <br />

`docker run -e "OUTPUT_FILE=output.txt" --rm -it football-demo:latest`<br />

<h3>**The easier way - If you already have Java installed:**<br /></h3>
Set the output file and run the fat jar using this command:<br />

`OUTPUT_FILE=output.txt java -jar target/football-api-wrapper-jar-with-dependencies.jar`
