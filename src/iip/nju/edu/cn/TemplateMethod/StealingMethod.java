package iip.nju.edu.cn.TemplateMethod;

public abstract class StealingMethod {

  protected abstract String pickTarget();

  protected abstract void confuseTarget(String target);

  protected abstract void stealTheItem(String target);

  /**
   * Steal
   */
  public final void steal() {
    String target = pickTarget();
    System.out.println("The target has been chosen as " + target + ".");
    confuseTarget(target);
    stealTheItem(target);
  }
}