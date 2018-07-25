'''
@Author: Anubhav
'''

graph = {1:[2],2:[4],3:[4],4:[3],5:[]}



visited =[]

def visit(key,graph,visited):

	if key in graph.keys():
		if key not in visited:
			print("visited")
			print(key)
			visited.append(key)
			for value in graph[key]:
				visit(value,graph,visited)

for key in graph.keys():
	visit(key,graph,visited)



		