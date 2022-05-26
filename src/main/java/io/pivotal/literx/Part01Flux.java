package io.pivotal.literx;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

/**
 * Learn how to create Flux instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {

//========================================================================================

	// TODO Return an empty Flux
	Flux<String> emptyFlux() {

		Flux<String> fluxExample= Flux.empty();

		return fluxExample;
	}

//========================================================================================

	// TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
	Flux<String> fooBarFluxFromValues() {

		Flux<String> fluxExample= Flux.just("foo", "bar");

		return fluxExample;
	}

//========================================================================================

	// TODO Create a Flux from a List that contains 2 values "foo" and "bar"
	Flux<String> fooBarFluxFromList() {

		List<String> lista = new ArrayList<>();
		lista.add("foo");
		lista.add("bar");
		Flux<String> fluxExample= Flux.fromIterable(lista);

		return fluxExample;
	}

//========================================================================================

	// TODO Create a Flux that emits an IllegalStateException
	Flux<String> errorFlux() {

		Flux<String> fluxExample= Flux.error(new IllegalStateException());

		return fluxExample;
	}

//========================================================================================

		// TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
	Flux<Integer> counter() {

		Flux<Integer> fluxExample = Flux.range(0, 10);
		return fluxExample;
	}

}
