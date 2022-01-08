from flask import Flask
app = Flask(__name__)

# @app.route("/")
@app.route("/hello")
@app.route("/caonima")

def hello():
    return "hello world\n"
def caonima():
    return "cnm"
if __name__=="__main__":
    app.run()