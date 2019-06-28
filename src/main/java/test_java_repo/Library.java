package test_java_repo;

public class Library {
  static void execute() {}

  class Inner {
    Inner2 getInner2() { return null; }
  }

  class Inner2 {
    void inner2() {}
  }

  class Test<A> {}

  class TestInner extends Test<Inner> {
  }

  class Splitor<B> {}

  interface Fn<C, D> {
    D run(C c);
  }

  class BaseStream<Z> {
    Z onClose() { return null; }
  }

  class Stream<E> extends BaseStream<Stream<E>> {
    E e;
    <F> Stream<F> map(Fn<? super E, ? extends F> fn) { return null; }
  }

  <G> Stream<G> wrap(Splitor<G> s) { return null; }

  <H> Splitor<H> run(Test<? extends H> t) { return null; }

  void method() {
    TestInner t = null;
    wrap(run(t))
      .onClose()
      .map(a -> {
        int x = 0;
        return a.getInner2();
      })
      .e
      .inner2();
  }
}
