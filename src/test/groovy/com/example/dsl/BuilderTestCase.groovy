package com.example.dsl

import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNotNull

import org.junit.Test

import com.example.dsl.samples.SampleOrganization

class BuilderTestCase {
	@Test
	void 'build organization and verify users, groups' () {
		def organization = new SampleOrganization().build()

		assertEquals 3, organization.users.size()
		assertEquals 2, organization.groups.size()
		assertEquals "Sample Organization", organization.name
	}
}
