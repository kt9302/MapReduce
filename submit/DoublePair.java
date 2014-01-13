/*
 * CS 61C Fall 2013 Project 1
 *
 * DoublePair.java is a class which stores two doubles and 
 * implements the Writable interface. It can be used as a 
 * custom value for Hadoop. To use this as a key, you can
 * choose to implement the WritableComparable interface,
 * although that is not necessary for credit.
 */

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.Writable;

public class DoublePair implements Writable {
    // Declare any variables here
    double first;
    double second;
    /**
     * Constructs a DoublePair with both doubles set to zero.
     */
    public DoublePair() {
        // YOUR CODE HERE
	first=0;
	second=0;
    }

    /**
     * Constructs a DoublePair containing double1 and double2.
     */ 
    public DoublePair(double double1, double double2) {
        // YOUR CODE HERE
	first=double1;
	second=double2;
    }

    /**
     * Returns the value of the first double.
     */
    public double getDouble1() {
        // YOUR CODE HERE
        return first;
    }

    /**
     * Returns the value of the second double.
     */
    public double getDouble2() {
        // YOUR CODE HERE
        return second;
    }

    /**
     * Sets the first double to val.
     */
    public void setDouble1(double val) {
        // YOUR CODE HERE
	first=val;
    }

    /**
     * Sets the second double to val.
     */
    public void setDouble2(double val) {
        // YOUR CODE HERE
	second=val;
    }

    /**
     * write() is required for implementing Writable.
     */
    public void write(DataOutput out) throws IOException {
        // YOUR CODE HERE
	out.writeDouble(this.getDouble1());
	out.writeDouble(this.getDouble2());
    }

    /**
     * readFields() is required for implementing Writable.
     */
    public void readFields(DataInput in) throws IOException {
        // YOUR CODE HERE
	this.setDouble1(in.readDouble());
	this.setDouble2(in.readDouble());
    }
    /*public int compareTo(DoublePair d){
	if (this.getDouble1()<d.getDouble1()){
	    return -1;}
	else if (this.getDouble1()>d.getDouble1()){
	    return 1;}
	else {
	    return this.getDouble2().compareTo(d.getDouble2());}
    }
    public int hashCode(){
	int hash=17;
	hash=hash*31+new Long(first).hashcode();
	hash=hash*31+second.hashCode();
	return hash;
	}*/
}
