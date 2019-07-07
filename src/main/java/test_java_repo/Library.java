package test_java_repo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class Library {
  interface Collector<T, A, R> {}

  static class Person {
    String getName() { return null; }
  }

  static <T, K, D, A, M extends Map<K, D>> Collector<T, ?, M> groupingBy(
    Function<? super T, ? extends K> classifier,
    Supplier<M> mapFactory,
    Collector<? super T, A, D> downstream
  ) {
    return null;
  }

  static void execute() {
    Collector<Person, ?, Long> collector = null;
    groupingBy(
      Person::getName,
      HashMap::new,
      collector
    );
  }
}
