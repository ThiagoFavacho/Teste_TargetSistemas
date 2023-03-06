import json

with open("dados.json") as dados_json:
    dados = json.load(dados_json)

print('Maior Faturamento', max(dados, key=lambda x: x['valor']))
print('Menor Faturamento', min(dados, key=lambda x: x['valor']))