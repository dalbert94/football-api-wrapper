<h1>Football API wrapper :soccer:</h1>
This program is used to make calls to the Hackerrank football API. The demo will prompt the user to enter a year and write the total number of draws that year to an output file. The output file is defined as an environment variable. The program will also show the user how the total number was tallied using standard output.

<h4>*How to Demo this project:*</h4>

<h3>The easy way (You must have docker installed)</h3>

Build and package Docker container. You may need help from sudo. <br />

`docker build -t football-demo .`<br />

Set the output file and run app in Docker container. <br />

*Note: output.txt is only found within the docker container. The results also appear in StdOut*<br />

`docker run -e "OUTPUT_FILE=output.txt" --rm -it football-demo:latest`<br />

<h3>*The easier way (You must have Java installed)*<br /></h3>
Set the output file and run the executable jar with built-in dependencies<br />

`OUTPUT_FILE=output.txt java -jar target/football-api-wrapper-jar-with-dependencies.jar`

You can also rebuild the fat jar yourself before running the previous command<br />

`mvn clean package`

