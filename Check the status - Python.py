f (a<0 and b>0) and flag==False:
        return True
    elif (a>0 and b<0) and flag==False:
        return True
    elif (a<0 and b<0) and flag==True:
        return True
    else:
        return False
