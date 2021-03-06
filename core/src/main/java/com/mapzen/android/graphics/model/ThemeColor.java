package com.mapzen.android.graphics.model;

/**
 * Available color themes for {@link RefillStyle}.
 */
public enum ThemeColor {
  BLACK("black"),
  BLUE("blue"),
  BLUEGRAY("blue-gray"),
  BROWNORANGE("brown-orange"),
  GRAY("gray"),
  GRAYGOLD("gray-gold"),
  HIGHCONTRAST("high-contrast"),
  INTROVERTED("introverted"),
  INTROVERTEDBLUE("introverted-blue"),
  PINK("pink"),
  PINKYELLOW("pink-yellow"),
  PURPLEGREEN("purple-green"),
  SEPIA("sepia");

  private final String color;

  /**
   * Constructor.
   * @param color
   */
  ThemeColor(String color) {
    this.color = color;
  }

  /**
   * Returns string value of theme color.
   * @return
   */
  public String toString() {
    return color;
  }
}
