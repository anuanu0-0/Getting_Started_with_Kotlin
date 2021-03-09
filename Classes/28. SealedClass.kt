// Sealed Classes
// There can be multiple instances of sealed subclasses
// The subclasses can have their qwn properties

sealed class NetworkState {
    data class Error(val errorText:String) : NetworkState()
    object Loading : NetworkState()
    data class Loaded(val content : String) : NetworkState()
}

fun main() {
    val data : NetworkState = NetworkState.Loaded("Data Loaded")
    processState(data)
}

fun processState(state: NetworkState) {
    when(state) {
        is NetworkState.Error -> {println("Error: ${state.errorText}")}
        is NetworkState.Loading -> {/*----------*/}
        is NetworkState.Loaded -> {println("Content: ${state.content}")}
        // No need for else as well as all cases are covered
    }
}