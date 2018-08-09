arr =[7,3,5,6,2,9,1]

def quicksort(arr,left,right):
	if(left>=right):
		return
	mid =(left+right)/2	
	pivot = arr[mid]
	index = partition(arr,left,right,pivot)	
	quicksort(arr,left,index-1)
	quicksort(arr,index,right)

def partition(arr,left,right,pivot):
	while arr[left]<pivot:
		left=left+1

	while arr[right]>pivot:
		right=right-1
	if left<=right:
		temp = arr[left]
		arr[left]=arr[right]
		arr[right]=temp
		left=left+1
		right=right-1
	return left	
size =len(arr)-1
quicksort(arr,0,size)					
for i in arr:
	print i