public class LogTable {

	public static void main(String[] args) {
		
		System.out.print( "<html>\n<body>\n<table>" );
		System.out.print( "<tr><th>x</th><th>ln(x)</th></tr>" );

		for( int i = 0; i < 20; i++ ) {

			double n = ( double ) i / 10;
			System.out.println( "<tr><td>" + n + "</td><td>" + Math.log( n ) + "</td></tr>" );

		}

		 System.out.println("</table>\n</body>\n</html>");

	}

}