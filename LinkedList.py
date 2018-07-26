'''
@AUthor : Anubhav
'''


class Node:

	def __init__(self,data,next):
		self.data = data
		self.next = next
	def get_data(self):
		return self.data	
	def get_next(self):
		return selt.next
	def set_data(data):
		self.data=data
	def set_next(self,node):
		self.next = node		

head = Node(1,Node(2,Node(3,None)))

def printList(head):
	while(head!=None):
		print(head.get_data())
		head = head.next

def reverseListRecursion(head,prevNode): 
	if(head!=None):
		temp = head.next
		head.next = prevNode
		return reverseListRecursion(temp,head)
	else:
		return prevNode
def reversaList(head):
	current=head
	next = head.next
	prevNode =None

	while(current!=None):
		next = current.next
		current.next =prevNode
		prevNode = current
		current = next

	return prevNode	

printList(head)
print("-----")
newHead = reverseListRecursion(head,None)
printList(newHead)
newHead = reversaList(newHead)
printList(newHead)
