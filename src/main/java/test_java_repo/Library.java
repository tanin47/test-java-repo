package test_java_repo;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Library {
  static void execute() {}

  class Something {
    void next() {}
    AnotherThing transform() { return null; }
  }

  class AnotherThing {
    void next() {}
  }

  class TheOtherThing extends AnotherThing {
    @Override
    void next() {}
  }

  class Collector<T, A, R> {
    R next() { return null; }
  }

  class Iterator<T> {
    T next() { return null; }
  }

  <T, R, D, A, M extends Iterator<R>> Collector<T, ?, M> generate(
    Function<T, R> classifier,
    Supplier<M> supplier,
    Collector<T, A, D> downstream
  ) { return null; }

  <T, R, D, A, M extends Iterator<R>> Collector<T, ?, M> generate(
    Function<T, R> classifier,
    Collector<T, A, D> downstream
  ) { return null; }

  void run() {
    Collector<Something, ?, TheOtherThing> downstream = null;
    generate(Something::transform, Iterator::new, downstream)
      .next()
      .next()
      .next();

    generate(Something::transform, downstream)
      .next()
      .next()
      .next();
  }
}
