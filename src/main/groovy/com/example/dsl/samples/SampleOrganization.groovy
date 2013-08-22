package com.example.dsl.samples

class SampleOrganization {
	def build() {
		def builder = new ObjectGraphBuilder(
			classLoader: SampleOrganization.class.classLoader,
			classNameResolver: "com.example"
		)

		return builder.organization(
			name: "Sample Organization"
		) {
			users = [
				user(
					id: "john",
					name: "John"
				),

				user(
					id: "samanta",
					name: "Samanta"
				),

				user(
					id: "tom",
					name: "Tom"
				)
			]

			groups = [
				group(
					id: "administrators",
					name: "administrators",
					users: [ john, tom ]
				),
				group(
					id: "managers",
					name: "managers",
					users: [ samanta ]
				)
			]
		}
	}
}
