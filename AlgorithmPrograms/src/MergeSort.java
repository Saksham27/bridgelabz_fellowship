class MergeSort{
	
	public static void merge(String[] s,int l,int m,int h) {
		int n1 = m-l+1;
		int n2 = h-m;
		
		String[] s1 = new String[n1];
		String[] s2 = new String[n2];
		
		for (int i = 0; i < n1; i++) {
			s1[i]=s[l+i];
		}
		for (int j = 0; j < n2; j++) {
			s2[j]=s[m+1+j];
		}
		
	
		int i=0;
		int j=0;
		int k=l;
		
		while(i<n1 && j<n2) {
			if(s1[i].compareTo(s2[j])<=0) {
				s[k++] = s1[i++];
			}else {
				s[k++] = s2[j++];
			}
		}
		
		while(i<n1) {
			s[k++] = s1[i++];
		}
		while(j<n2) {
			s[k++] = s2[j++];
		}
			
	}
	
	public static String[] mergeSort(String[] s,int l,int h) {
		int m;
		if(l<h) {
			m = l+ (h-l)/2;
			
			mergeSort(s,l,m);
			mergeSort(s,m+1,h);
			merge(s,l,m,h);
		}
		
		return s;
		
		
	}
	
	public static void main(String[] args) {
		
		String[] nameList = {"John","Peter","Wanda","Steve","Tony","Bruce","Erik"};
		int h = nameList.length;
		String[] f = mergeSort(nameList,0,h-1);
		
		for(int i=0;i<h;i++) {
			System.out.print(f[i]+" ");
		}
	}
	
}