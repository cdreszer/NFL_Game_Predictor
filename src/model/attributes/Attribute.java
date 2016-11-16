package model.attributes;

import java.io.Serializable;

/**
 * @author cdreszer
 * @version 11/15/16.
 */
public interface Attribute extends Serializable {
   public static final long serialVersionUID = 42L;

   public int getCategorizedValue();
   public double getDiscreteValue();
}
