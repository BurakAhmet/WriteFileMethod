public class File {
	public static void writeFile() {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		try 
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter ("/*YOUR FILE PATH GOES HERE*/",true));
			writer.newLine();
			writer.write(str);
			System.out.println("Dosyaya yazıldı");
			writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
}
