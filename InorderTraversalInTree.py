'''
@AUthor : Anubhav
'''

class Node:
	def __init__(self,data,leftChild,rightChild):
		self.data=data
		self.leftChild=leftChild
		self.rightChild=rightChild
	def getLeft(self):
		return self.leftChild
	def getRight(self):
		return self.rightChild
	def getData(self):
		return self.data

#         5
#       2   11
#     3	  4

treeHead= Node(5,Node(2,Node(3,None,None),Node(4,None,None)),Node(11,None,None))

def inorderRecursive(head):
	if(head.leftChild!=None):
		 inorderRecursive(head.leftChild)
	if(head!=None):
		 print(head.getData()),
	if(head.rightChild!=None):
		 inorderRecursive(head.rightChild)

def inorderIterative(head):
	nodeList=[]
	current = head
	done =0
	while(done==0):
		if current is not None:
			nodeList.append(current)
			current= current.getLeft()
		else:
			if(len(nodeList)>0):
				current= nodeList.pop()
				print (current.getData()),
				current = current.getRight()
			else:
				done = 1

	




print("Reursive inorder traversal")
inorderRecursive(treeHead)		
print("Iterative inorder traversal")
inorderIterative(treeHead)

