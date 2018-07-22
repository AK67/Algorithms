'''
@author ANUBHAV KAUSHIK
'''

print "Starting...!"
'''
#make user input
mangoes = int(input("number of mangoes"))
persons = int(input("number of persons"))
'''
mangoes=99
persons=99

helperMatrix = [[-1 for x in range(mangoes)] for y in range(persons)] 



print("asd")
def findCombos(mangoes,persons):
	if(helperMatrix[mangoes][persons]!= -1):
		return helperMatrix[mangoes][persons]
	
	sum =0;
	if(mangoes==0):
		return 1
	if(persons<=1):
		return 1		
	else:
		for x in range(mangoes):

			for y in range(persons-1):
				sum = sum + findCombos(x,y)
	helperMatrix[mangoes][persons]=sum
	return sum


result = findCombos(60,81)
print result