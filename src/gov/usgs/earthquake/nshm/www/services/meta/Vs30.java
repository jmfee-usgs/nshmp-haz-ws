package gov.usgs.earthquake.nshm.www.services.meta;

@SuppressWarnings("javadoc")
public enum Vs30 {

	VS_2000("Site class A"),
	VS_1150("Site class B"),
	VS_760("B/C boundary"),
	VS_537("Site class C"),
	VS_360("C/D boundary"),
	VS_259("Site class D"),
	VS_180("D/E boundary");

	private String label;
	private double value;

	private Vs30(String label) {
		this.label = label;
		this.value = Double.valueOf(name().substring(3));
	}

	@Override public String toString() {
		return this.name().substring(3) + " m/s (" + label + ")";
	}

	/**
	 * Return the Vs30 value for this identifier.
	 */
	public double value() {
		return value;
	}
	
	/**
	 * Create a Vs30 constant from a Vs30 {@code value}.
	 * @param value to process
	 */
	public static Vs30 fromValue(double value) {
		String name = "VS_" + (int) value;
		return Enum.valueOf(Vs30.class, name);
	}

}
