
import java.util.*;

public class ArrayListChallenges {
	
	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>(Arrays.asList( "apple", "blueberry", "peach", "apricot", "lychee", "strawberry", "mango", "pineapple", "papaya", "grapefruit" ));
		ArrayList<String> vegetables = new ArrayList<>(Arrays.asList( "broccoli", "cauliflower", "artichoke", "asparagus", "arugula", "green beans", "beets", "bitter melon", "carrot", "spinach" ));
		ArrayList<String> fruits2 = new ArrayList<>(Arrays.asList( "apple", "lychee", "fig", "pomegranate", "raspberry", "strawberry", "mango", "persimmon", "grapefruit", "jackfruit" ));
		ArrayList<String> animals = new ArrayList<>(Arrays.asList( "cheetah", "tardigrade", "pigeon", "dolphin", "narwhal", "llama", "cheetah", "llama", "tardigrade", "orca" )); 
		ArrayList<Integer> nums = new ArrayList<>( Arrays.asList( 1, 3, 3, 4, 4, 5, 6, 7, 8, 10 ) );
		ArrayList<Integer> nums2 = new ArrayList<>( Arrays.asList( 2, 4, 5, 3, 1, 1, 9, 1, 2, 3 ) );
		ArrayList<Point> points = createPoint( nums2 );

		// display( sort( fruits, vegetables ) );
		// display( common( fruits, fruits2 ) );
		// display( removeDuplicates( animals ) );
		// displayInt( addSort( nums, 2 ) );
		// displayInt( reverse( nums ) );
		// System.out.println( createPoint( nums ) );
		// System.out.println( createMidPoints( createPoint( nums ) ) );
		Collections.sort( points );
		System.out.println( points );

	}

	public static ArrayList<String> sort( ArrayList<String> fruits, ArrayList<String> vegetables ) {
		fruits.addAll( vegetables );
		Collections.sort( fruits );
		return fruits;
	}

	public static ArrayList<String> common( ArrayList<String> fruits, ArrayList<String> fruits2 ) {
		ArrayList<String> temp = new ArrayList<String>( fruits );
		temp.retainAll( fruits2 );
		return temp;
	}

	public static ArrayList<String> removeDuplicates( ArrayList<String> animals ) {
		Collections.sort( animals );
		for( int i = 0; i < animals.size() - 1; i++ ) {
			if( animals.get( i ).equals( animals.get( i + 1 ) ) ) {
				animals.remove( i );
			}
		}
		return animals;
	}

	public static ArrayList<Integer> addSort( ArrayList<Integer> list, int x ) {
		int index = 0;
		for( int i = 0; i < list.size(); i++ ) {
			if( list.get( i ) > x ) {
				index = i;
				break;
			}
		}
		list.add( index, x );
		return list;
	}

	public static ArrayList<Integer> reverse( ArrayList<Integer> list ) {
		for( int i = 0; i < ( list.size() ) / 2; i++ ) {
			int temp = list.get( i );
			list.set( i, list.get( list.size() - 1 - i ) );
			list.set( list.size() - i - 1, temp );
		}
		return list;
	}

	public static ArrayList<Point> createPoint( List<Integer> list ) {
		ArrayList<Point> points = new ArrayList<Point>();
		for ( int i = 0; i < list.size() - 1; i += 2 ) {
            points.add( new Point( list.get( i ), list.get( i + 1 ) ) );
        }
        return points;
	}


	public static ArrayList<Point> createMidPoints( ArrayList<Point> list ) {
		ArrayList<Point> midPoints = new ArrayList<Point>();
		for( int i = 0; i < list.size() - 1; i++ ) {
			midPoints.add( list.get( i ) );
			midPoints.add( list.get( i ).getMidPoint( list.get( i + 1 ) ) );
		}
		midPoints.add( list.get( list.size() - 1 ) );
		return midPoints;
	}

	public static void display( ArrayList<String> list ) {
		for( String s : list ) {
			System.out.println( s );
		}
	}

	public static void displayInt( ArrayList<Integer> list ) {
		for( int s : list ) {
			System.out.println( s );
		}
	}

}