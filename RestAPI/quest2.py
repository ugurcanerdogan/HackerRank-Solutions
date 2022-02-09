import requests


def getTotalGoals(year):
    sumOfDraw = 0
    url = "https://jsonmock.hackerrank.com/api/football_matches"
    query_year = "?year=" + str(year)

    for i in range(16):
        response = requests.get((url + query_year + "&team1goals={0}" + "&team2goals={0}").format(i, i)).json()
        sumOfDraw += response['total']

    return sumOfDraw
