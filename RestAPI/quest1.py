import requests


def getTotalGoals(team, year):
    sumOfGoals = 0
    url = "https://jsonmock.hackerrank.com/api/football_matches"
    query_year = "?year=" + str(year)
    team1_preResponse = requests.get(url + query_year + "&team1=" + str(team) + "&page=1").json()
    total_pages_team1 = team1_preResponse["total_pages"]
    rec_per_page_team1 = team1_preResponse["per_page"]

    for i in range(1, total_pages_team1 + 1):
        team1_response = requests.get(url + query_year + "&team1=" + str(team) + "&page=" + str(i)).json()
        try:
            for j in range(0, rec_per_page_team1):
                team1_goals = team1_response["data"][j]["team1goals"]
                sumOfGoals += int(team1_goals)
        except:
            pass

    team2_preResponse = requests.get(url + query_year + "&team2=" + str(team) + "&page=1").json()
    total_pages_team2 = team2_preResponse["total_pages"]
    rec_per_page_team2 = team2_preResponse["per_page"]

    for i in range(1, total_pages_team2 + 1):
        team2_response = requests.get(url + query_year + "&team2=" + str(team) + "&page=" + str(i)).json()
        try:
            for j in range(0, rec_per_page_team2):
                team2_goals = team2_response["data"][j]["team2goals"]
                sumOfGoals += int(team2_goals)
        except:
            pass
    return sumOfGoals
