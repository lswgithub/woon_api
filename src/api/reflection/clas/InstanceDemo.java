package api.reflection.clas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JPanel;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;

public class InstanceDemo {
	/** A set of demon objects **/
	@SuppressWarnings("rawtypes")
	public static final Set OBJECT_SET;
	
	static {
		Set objectSet = new HashSet();
		objectSet.add( new Integer(5));
		objectSet.add(new String("Hardcare Java"));
		objectSet.add(new Float(22.51));
		objectSet.add(new JPanel());
		objectSet.add(new Character('x'));
		objectSet.add(new ArrayList());
		objectSet.add(new Double(432432.43242));
		objectSet.add(null);
		OBJECT_SET = Collections.unmodifiableSet(objectSet);
	}
	/*
	Demo method.
	
	@param args
	command Line arguments.
	*/
	public static void main(String[] args) {
		final Iterator iter = OBJECT_SET.iterator();
		Object obj = null;
		while(iter.hasNext()) {
			obj = iter.next();
			if (obj instanceof Number) {
				System.out.println(obj);
			}
		}
	}
	
}
