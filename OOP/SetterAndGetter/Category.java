package OOP.SetterAndGetter;

public class Category {

  private String id;
  private boolean expensive;

  // Getter
  public String getId() {
    return id;
  }

  // Setter Validation
  public void setId(String id) {
    if (id != null) {
      this.id = id;
    }
  }

  // Getter
  public boolean isExpensive() {
    return expensive;
  }

  // Setter
  public void setExpensive(boolean expensive) {
    this.expensive = expensive;
  }
}
