import numpy as np
A = np.array([[1,1,1,1],[3,2,1,0],[8,4,2,1],[27,9,3,1]])
B = np.array([0,1,0,0])
C = np.linalg.solve(A,B)
print(C)