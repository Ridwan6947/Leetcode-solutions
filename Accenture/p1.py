def max_bags_sold(n, m, customers, bags):
    bags.sort()
    customers.sort(key= lambda x:x[1])

    sold_bags = 0
    bag_index = 0

    for i in range(n):
        quantity_pref, price_pref = customers[i]

        while bag_index < m:
            bag_quantity, bag_price = bags[bag_index]

            if bag_price <= price_pref and bag_quantity >= quantity_pref:
                sold_bags += 1
                bag_index += 1
                break

            bag_index += 1

    return sold_bags

# Input
n, m = map(int, input().split())
customers = [list(map(int, input().split())) for _ in range(n)]
bags = [list(map(int, input().split())) for _ in range(m)]

# Output
result = max_bags_sold(n, m, customers, bags)
print(result, end='')
