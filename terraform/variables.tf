variable "rg_name" {
  type    = string
  default = "conception_plan_dev"
}


variable "location" {
  type    = string
  default = "northeurope"
}

variable "CLIENT_ID" {
  sensitive = true
}
variable "TENANT_ID" {
  sensitive = true
}
variable "CLIENT_SECRET" {
  sensitive = true
}
variable "SUBSCRIPTION_ID" {
  sensitive = true
}

