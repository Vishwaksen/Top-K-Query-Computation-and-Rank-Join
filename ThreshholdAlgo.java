package Practice;
import java.util.*;
class TopKElement implements Comparable<TopKElement>{
	Float id, score;
	public int compareTo(TopKElement o){
		return this.score.compareTo(o.id);
	}	
	public TopKElement(Float id, Float score) {
		super();
		this.id = id;
		this.score = score;
	}
	public boolean equals(Object o){
		if(o instanceof TopKElement){
			return (((TopKElement)o).id == this.id);
		}
		return false;
	}
}
public class ThreshholdAlgo {
	/*
	 * 1. Maintain a treemap for all Attributes i.e. <id,A1>, <id,A2>, <id,A3>... <id,An>
	 * 
	 */
	private Double computeThreshold(Double a1[], Double a2[], int noAttr){
		Double threshold = 0d;
		for(int i=0;i<noAttr;i++){
			threshold+=a1[i]*a2[i];
		}
		return threshold;
	}
	public List<arg> thresholdAlgo(int n, int k, List<ArrayList<SortedAttributeListTuple>> listOfAttr, List<Btree> bIndex, Double V[], int noAttr){
		PriorityQueue<SortedAttributeListTuple> result = new PriorityQueue<SortedAttributeListTuple>();
		SortedAttributeListTuple attrValues[] = new SortedAttributeListTuple[noAttr];
		SortedAttributeListTuple curTuple = new SortedAttributeListTuple();
		Double threshold = 0d;
		HashSet<Double> newKeys = new HashSet<Double>();
		//Threshold Algorithm 
		for(int i=0;i<n;i++){
			if(result.size()>=k && result.peek().getValue()>= threshold){		//check this
				break;
			}
			int j=0;
			for(Iterator<ArrayList<SortedAttributeListTuple>> listIterator = listOfAttr.iterator();listIterator.hasNext();j++){
				curTuple = listIterator.next().get(i);
				attrValues[j] = curTuple.getValue();				
				newKeys.add(curTuple.getKey());
			}
			for(Iterator<Double> newKeysIterator = newKeys.iterator();newKeysIterator.hasNext();){
				Double temp = newKeysIterator.next();
				Double curThreshold = 0d; 
				if(!result.contains(temp)){
					//search for all attribute values using B tree for pid=temp
					//  compute its threshold value into curThreshold
					if(curThreshold>)
				}
			}
		}		
		threshold = computeThreshold(attrValues,V,noAttr);
		if(result.size()<k){
			
		}
		else{
			
		}
	}
	
}
