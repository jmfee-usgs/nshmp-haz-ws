package gov.usgs.earthquake.nshm.www.meta;

public enum ParamType {
  INTEGER,
  NUMBER,
  STRING;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
