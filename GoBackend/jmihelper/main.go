package main

import (
	_ "jmihelper/routers"

	beego "github.com/beego/beego/v2/server/web"
)

func main() {

	beego.Run()
}
