package Streamspac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class App {
	public static void main(String[] args) {
//		IntStream.range(1, 10).skip(2).forEach((x)->System.out.print(x));
//		System.out.println(IntStream.range(1, 10).sum());
//		Stream.of("Hello","World","ABC","AAc").sorted().findFirst().ifPresent((x)->System.out.println(x));
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,9,5,4,3,5,2,5,7);
		Stream<Integer> stream3 = Stream.of(1,2,3,4,5,6,7,8,9,9,5,4,3,5,2,5,7);
		Stream<String> empty = Stream.empty();
		Stream<Double> randoms = Stream.generate(Math::random).limit(5);
		Stream<Integer> evens = Stream.iterate(0, n -> n + 2).limit(5);
		ArrayList<String> list = new ArrayList<String> (Arrays.asList("Apple", "Banana", "Cherry"));
		Stream<String> stream2 = list.stream();
//		stream2.filter(s -> s.startsWith("A")).forEach(System.out::println);
//		stream2.map(String::toUpperCase).forEach(x->System.out.println(x));
//		stream.sorted().forEach(x->System.out.print(x+" "));
//		stream2.peek(x->System.out.println(x));
//		stream2.dropWhile(s -> s.length() < 5).forEach(x->System.out.println(x));
//		stream.forEach(System.out::print);
//		stream3.forEachOrdered(System.out::print);
		list.parallelStream().forEachOrdered(x->System.out.print(x+" "));
		list.stream().forEach(x->System.out.print(x+" "));
//		stream2.forEach(System.out::println);
	}
}
