import java.io.*;

public class Main { 

public static void main(String[] args) {

try{
File input = new File("Input.txt");
BufferedReader in = new BufferedReader(new FileReader(input));
File output = new File("Output.txt");
if (!output.exists()) {
output.createNewFile();
}
BufferedWriter out = new BufferedWriter(new FileWriter(output));

boolean addU = false;
int i;
char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

while ((i = in.read()) != -1) {
  
char c = (char) i;
char cUp = Character.toUpperCase(c);

if (new String(alphabet).contains(String.valueOf(cUp))) {
out.write(alphabet[(new String(alphabet).indexOf(cUp)+5)%26]);

  if (cUp == 'O' || cUp == 'E' || cUp == 'B') {
    out.write(c);
    out.write(c);
  }
  
  if (addU == false) {
    out.write('U');
    addU = true;
  } else {
    addU = false;
  }

} else {

out.write(c);

}
}

out.close();
in.close();

} catch (IOException ioe) {

ioe.printStackTrace();

}

}

}
