n=int(input("range\n"))
for i in range(1, n + 1):
        # Print leading spaces
        for j in range(n - i):
            print(" ", end="")
        for k in range(1,i+1):
            print("*", end="")
        print()