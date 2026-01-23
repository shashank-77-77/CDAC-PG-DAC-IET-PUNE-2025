using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace prac.Migrations
{
    /// <inheritdoc />
    public partial class ModelFix : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropPrimaryKey(
                name: "PK_Emp",
                table: "Emp");

            migrationBuilder.RenameTable(
                name: "Emp",
                newName: "emp");

            migrationBuilder.AddPrimaryKey(
                name: "PK_emp",
                table: "emp",
                column: "id");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropPrimaryKey(
                name: "PK_emp",
                table: "emp");

            migrationBuilder.RenameTable(
                name: "emp",
                newName: "Emp");

            migrationBuilder.AddPrimaryKey(
                name: "PK_Emp",
                table: "Emp",
                column: "id");
        }
    }
}
