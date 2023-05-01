package Exception;

public class AutorisationException extends Exception {
  public AutorisationException() {
    super("Retrait non autorisé");
  }
}
