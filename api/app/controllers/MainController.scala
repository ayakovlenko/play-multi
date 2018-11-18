package controllers

import com.example.core.Foo
import com.google.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

class MainController @Inject()(cc: ControllerComponents)
    extends AbstractController(cc) {

  def index() = Action {
    Ok(Foo.bar)
  }
}
