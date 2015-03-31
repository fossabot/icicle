package com.intenthq.icicle;

/**
 * Represents an ID that can be used to store records in the immutable data-store with strong
 * guarantees of k-ordering.
 */
public class Id {
  /**
   * A long value representing an ID as generated by the IdGenerator.
   */
  private final long id;

  /**
   * The timestamp this ID was created at, in milliseconds.
   */
  private final long time;

  public Id(final long id, final long time) {
    this.id = id;
    this.time = time;
  }

  public long getId() {
    return id;
  }

  public long getTime() {
    return time;
  }

  @Override
  public String toString() {
    return Long.toString(id);
  }
}