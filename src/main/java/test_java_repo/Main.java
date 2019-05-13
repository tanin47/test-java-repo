package test_java_repo;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;

public class Main {
  public static void main(String[] args) {
    Stripe.getApiBase();

    // a new commit

    try {
      Charge.create(null);
    } catch (StripeException e) {
    }
  }

  public static int get() { return 2; }
}
