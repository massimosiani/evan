package controllers

import play.api.mvc.Controller
import play.api.mvc.Action

class Tasks extends Controller {
  
  def list = Action {
    Ok(views.html.tasks())
  }
}